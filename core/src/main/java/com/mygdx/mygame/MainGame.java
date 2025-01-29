import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.physics.bullet.Bullet;
import com.badlogic.gdx.physics.bullet.dynamics.*;

public class MainGame extends ApplicationAdapter {
    private btDynamicsWorld dynamicsWorld;
    private btRigidBody carBody;

    @Override
    public void create() {
        Bullet.init();

        // Set up physics world
        btCollisionConfiguration collisionConfig = new btDefaultCollisionConfiguration();
        btDispatcher dispatcher = new btCollisionDispatcher(collisionConfig);
        btBroadphaseInterface broadphase = new btDbvtBroadphase();
        btConstraintSolver solver = new btSequentialImpulseConstraintSolver();
        dynamicsWorld = new btDiscreteDynamicsWorld(dispatcher, broadphase, solver, collisionConfig);
        dynamicsWorld.setGravity(new Vector3(0, -9.8f, 0));

        // Set up car physics
        btCollisionShape carShape = new btBoxShape(new Vector3(1f, 0.5f, 2f));
        btDefaultMotionState motionState = new btDefaultMotionState();
        btRigidBody.btRigidBodyConstructionInfo bodyInfo = 
            new btRigidBody.btRigidBodyConstructionInfo(1f, motionState, carShape, new Vector3(0, 0, 0));
        carBody = new btRigidBody(bodyInfo);
        dynamicsWorld.addRigidBody(carBody);
    }

    @Override
    public void render() {
        dynamicsWorld.stepSimulation(Gdx.graphics.getDeltaTime(), 5);
    }

    @Override
    public void dispose() {
        carBody.dispose();
        dynamicsWorld.dispose();
    }
}

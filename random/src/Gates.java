import org.redfx.strange.Program;
import org.redfx.strange.QuantumExecutionEnvironment;
import org.redfx.strange.Qubit;
import org.redfx.strange.Result;
import org.redfx.strange.Step;
import org.redfx.strange.gate.Hadamard;
import org.redfx.strange.local.SimpleQuantumExecutionEnvironment;

public class Gates {

	public static void main(String[] args) {
		QuantumExecutionEnvironment simulator = new SimpleQuantumExecutionEnvironment();
		
		// create program
		Program program = new Program(1);
		Step step = new Step();
		step.addGate(new Hadamard(0));
		program.addStep(step);
		
		// run program and process results
		Result result = simulator.runProgram(program);
		Qubit[] qubits = result.getQubits();
		System.out.println(qubits[0].measure());
	}

}

package org.patterns.input.stream.decorator;


import org.openjdk.jmh.annotations.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@OutputTimeUnit(TimeUnit.MILLISECONDS)
@BenchmarkMode(Mode.AverageTime)
@Fork(1)
@Measurement(iterations = 20)
@Warmup(iterations = 10)
public class ReaderBenchmark {

    public static void main(String[] args) throws IOException {
        org.openjdk.jmh.Main.main(args);
    }

    @Benchmark
    public String testLowerCaseInputStream(Input input) throws IOException {
        return new LowerCaseInputReader().read(input.path);
    }

    @Benchmark
    public String testStandardInputStream(Input input) throws IOException {
        return new StandardReader().read(input.path);
    }

    @State(Scope.Benchmark)
    public static class Input {
        final String path = "test.txt";
    }
}

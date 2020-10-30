package uk.co.threeonefour.ficdown;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

import java.nio.file.Path;

@Command(name = "parse", description = "ChatDownJ parser", version = "1.0")
public class FicDownJ implements Runnable {

    private static final Logger LOG = LoggerFactory.getLogger(FicDownJ.class);

    @Option(names = {"-f",
            "--file"}, description = "Input file to parse.", paramLabel = "<file>", required = true)
    private Path filePath;

    @Override
    public void run() {
    }
}

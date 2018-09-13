package be.kapture.tdd.wordchain;

import org.assertj.core.api.Assertions;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;

public class WordChainTest {

    @Ignore
    @Test
    public void fetchChain() {
        Assertions.assertThat(new WordChain(Arrays.asList("str1", "str2")).fetchChain("start", "end")).containsExactlyInAnyOrder("nothing");
    }
}
<script>
import { ref } from "vue";

export default {
    setup() {
        const greeting = ref("第六天而已，還好嗎？");

        return {
            greeting,
        };
    },
};
</script>

<template>
    <p class="greeting">{{ greeting }}</p>
</template>

<style>
.greeting {
    color: red;
    font-weight: bold;
}
</style>
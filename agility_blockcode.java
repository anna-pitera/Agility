async function startProgram() {
    resetAim();
    setHeading(45);
    await roll(45, 40, 2.5);
    await delay(1);
    setHeading(135);
    await roll(135, 40, 2.8);
    await delay(1);
    setHeading(45);
    await roll(45, 40, 2.9);
    await delay(1);
    setHeading(135);
    await roll(135, 170, 1.7);
    stopRoll();
    setHeading(135);
    await roll(135, 100, 0.5);
    await delay(1.5);
    setHeading(270);
    await roll(270, 60, 0.8);
    await roll(270, 255, 8);
}
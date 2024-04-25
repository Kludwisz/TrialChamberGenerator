package kludwisz.generator;

import com.seedfinding.mcbiome.biome.Biome;
import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.state.Dimension;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mccore.version.VersionMap;
import com.seedfinding.mcfeature.structure.RegionStructure;
import com.seedfinding.mcfeature.structure.UniformStructure;

public class TrialChambers extends UniformStructure<TrialChambers> {
	public static final VersionMap<RegionStructure.Config> CONFIGS = new VersionMap<RegionStructure.Config>()
		//  .add(MCVersion.v1_19, new RegionStructure.Config(32, 8, 94251327));
			.add(MCVersion.v1_19, new RegionStructure.Config(34, 12, 94251327));


	public TrialChambers(MCVersion version) {
		this(CONFIGS.getAsOf(version), version);
	}

	public TrialChambers(RegionStructure.Config config, MCVersion version) {
		super(config, version);
	}

	public static String name() {
		return "trial_chambers";
	}

	@Override
	public boolean canStart(Data<TrialChambers> data, long structureSeed, ChunkRand rand) {
		return super.canStart(data, structureSeed, rand);
	}

	@Override
	public Dimension getValidDimension() {
		return Dimension.OVERWORLD;
	}

	@Override
	public boolean isValidBiome(Biome biome) {
		return true;
	}
}

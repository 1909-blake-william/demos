package com.revature.daos;

import java.util.ArrayList;
import java.util.List;

import com.revature.models.PokemonMove;
import com.revature.models.PokemonType;

public class PokemonMovesDaoInMemory implements PokemonMovesDao {

	private List<PokemonMove> moves;
	private PokemonTypeDao pokemonTypeDao = PokemonTypeDao.currentImplementation;

	public PokemonMovesDaoInMemory() {
		super();
		List<PokemonType> types = pokemonTypeDao.findAll();
		moves = new ArrayList<PokemonMove>();
		// got from https://bulbapedia.bulbagarden.net/wiki/List_of_moves
		// using this js script
		/*
		 * [...document.getElementsByTagName('tbody')[1].childNodes].filter(row => {
			    return row.nodeName !== '#text';
			}).map(row => [row.childNodes[3].innerText, row.childNodes[5].innerText, row.childNodes[11].innerText.replace('*', '')])
			.filter(row => ['Bug', 'Fire', 'Ghost','Water','Flying','Grass','Electric'].includes(row[1]))
			.map((row, i) => 
			`moves.add(new PokemonMove(${i}, "${row[0]}", 
				types.get(${['Bug', 'Fire', 'Ghost','Water','Flying','Grass','Electric'].indexOf(row[1])}), 
				${row[2]}));`)
			.join('\n');
		 */
		moves.add(new PokemonMove(0, "Fire Punch", types.get(1), 15));
		moves.add(new PokemonMove(1, "Thunder Punch", types.get(6), 15));
		moves.add(new PokemonMove(2, "Gust*", types.get(4), 35));
		moves.add(new PokemonMove(3, "Wing Attack", types.get(4), 35));
		moves.add(new PokemonMove(4, "Fly", types.get(4), 15));
		moves.add(new PokemonMove(5, "Vine Whip", types.get(5), 25));
		moves.add(new PokemonMove(6, "Twineedle", types.get(0), 20));
		moves.add(new PokemonMove(7, "Pin Missile", types.get(0), 20));
		moves.add(new PokemonMove(8, "Ember", types.get(1), 25));
		moves.add(new PokemonMove(9, "Flamethrower", types.get(1), 15));
		moves.add(new PokemonMove(10, "Water Gun", types.get(3), 25));
		moves.add(new PokemonMove(11, "Hydro Pump", types.get(3), 5));
		moves.add(new PokemonMove(12, "Surf", types.get(3), 15));
		moves.add(new PokemonMove(13, "Bubble Beam", types.get(3), 20));
		moves.add(new PokemonMove(14, "Peck", types.get(4), 35));
		moves.add(new PokemonMove(15, "Drill Peck", types.get(4), 20));
		moves.add(new PokemonMove(16, "Absorb", types.get(5), 15));
		moves.add(new PokemonMove(17, "Mega Drain", types.get(5), 10));
		moves.add(new PokemonMove(18, "Leech Seed", types.get(5), 10));
		moves.add(new PokemonMove(19, "Razor Leaf", types.get(5), 25));
		moves.add(new PokemonMove(20, "Solar Beam", types.get(5), 10));
		moves.add(new PokemonMove(21, "Stun Spore", types.get(5), 30));
		moves.add(new PokemonMove(22, "Sleep Powder", types.get(5), 15));
		moves.add(new PokemonMove(23, "Petal Dance", types.get(5), 10));
		moves.add(new PokemonMove(24, "String Shot", types.get(0), 40));
		moves.add(new PokemonMove(25, "Fire Spin", types.get(1), 15));
		moves.add(new PokemonMove(26, "Thunder Shock", types.get(6), 30));
		moves.add(new PokemonMove(27, "Thunderbolt", types.get(6), 15));
		moves.add(new PokemonMove(28, "Thunder Wave", types.get(6), 20));
		moves.add(new PokemonMove(29, "Thunder", types.get(6), 10));
		moves.add(new PokemonMove(30, "Night Shade", types.get(2), 15));
		moves.add(new PokemonMove(31, "Confuse Ray", types.get(2), 10));
		moves.add(new PokemonMove(32, "Withdraw", types.get(3), 40));
		moves.add(new PokemonMove(33, "Mirror Move", types.get(4), 20));
		moves.add(new PokemonMove(34, "Lick", types.get(2), 30));
		moves.add(new PokemonMove(35, "Fire Blast", types.get(1), 5));
		moves.add(new PokemonMove(36, "Waterfall", types.get(3), 15));
		moves.add(new PokemonMove(37, "Clamp", types.get(3), 15));
		moves.add(new PokemonMove(38, "Leech Life", types.get(0), 10));
		moves.add(new PokemonMove(39, "Sky Attack", types.get(4), 5));
		moves.add(new PokemonMove(40, "Bubble", types.get(3), 30));
		moves.add(new PokemonMove(41, "Spore", types.get(5), 15));
		moves.add(new PokemonMove(42, "Crabhammer", types.get(3), 10));
		moves.add(new PokemonMove(43, "Spider Web", types.get(0), 10));
		moves.add(new PokemonMove(44, "Nightmare", types.get(2), 15));
		moves.add(new PokemonMove(45, "Flame Wheel", types.get(1), 25));
		moves.add(new PokemonMove(46, "Curse*", types.get(2), 10));
		moves.add(new PokemonMove(47, "Aeroblast", types.get(4), 5));
		moves.add(new PokemonMove(48, "Cotton Spore", types.get(5), 40));
		moves.add(new PokemonMove(49, "Spite", types.get(2), 10));
		moves.add(new PokemonMove(50, "Octazooka", types.get(3), 10));
		moves.add(new PokemonMove(51, "Zap Cannon", types.get(6), 5));
		moves.add(new PokemonMove(52, "Destiny Bond", types.get(2), 5));
		moves.add(new PokemonMove(53, "Giga Drain", types.get(5), 10));
		moves.add(new PokemonMove(54, "Spark", types.get(6), 20));
		moves.add(new PokemonMove(55, "Fury Cutter", types.get(0), 20));
		moves.add(new PokemonMove(56, "Sacred Fire", types.get(1), 5));
		moves.add(new PokemonMove(57, "Megahorn", types.get(0), 10));
		moves.add(new PokemonMove(58, "Synthesis", types.get(5), 5));
		moves.add(new PokemonMove(59, "Rain Dance", types.get(3), 5));
		moves.add(new PokemonMove(60, "Sunny Day", types.get(1), 5));
		moves.add(new PokemonMove(61, "Shadow Ball", types.get(2), 15));
		moves.add(new PokemonMove(62, "Whirlpool", types.get(3), 15));
		moves.add(new PokemonMove(63, "Heat Wave", types.get(1), 10));
		moves.add(new PokemonMove(64, "Will-O-Wisp", types.get(1), 15));
		moves.add(new PokemonMove(65, "Charge", types.get(6), 20));
		moves.add(new PokemonMove(66, "Ingrain", types.get(5), 20));
		moves.add(new PokemonMove(67, "Eruption", types.get(1), 5));
		moves.add(new PokemonMove(68, "Grudge", types.get(2), 5));
		moves.add(new PokemonMove(69, "Dive", types.get(3), 10));
		moves.add(new PokemonMove(70, "Tail Glow", types.get(0), 20));
		moves.add(new PokemonMove(71, "Feather Dance", types.get(4), 15));
		moves.add(new PokemonMove(72, "Blaze Kick", types.get(1), 10));
		moves.add(new PokemonMove(73, "Needle Arm", types.get(5), 15));
		moves.add(new PokemonMove(74, "Blast Burn", types.get(1), 5));
		moves.add(new PokemonMove(75, "Hydro Cannon", types.get(3), 5));
		moves.add(new PokemonMove(76, "Astonish", types.get(2), 15));
		moves.add(new PokemonMove(77, "Aromatherapy", types.get(5), 5));
		moves.add(new PokemonMove(78, "Air Cutter", types.get(4), 25));
		moves.add(new PokemonMove(79, "Overheat", types.get(1), 5));
		moves.add(new PokemonMove(80, "Silver Wind", types.get(0), 5));
		moves.add(new PokemonMove(81, "Grass Whistle", types.get(5), 15));
		moves.add(new PokemonMove(82, "Water Spout", types.get(3), 5));
		moves.add(new PokemonMove(83, "Signal Beam", types.get(0), 15));
		moves.add(new PokemonMove(84, "Shadow Punch", types.get(2), 20));
		moves.add(new PokemonMove(85, "Muddy Water", types.get(3), 10));
		moves.add(new PokemonMove(86, "Bullet Seed", types.get(5), 30));
		moves.add(new PokemonMove(87, "Aerial Ace", types.get(4), 20));
		moves.add(new PokemonMove(88, "Frenzy Plant", types.get(5), 5));
		moves.add(new PokemonMove(89, "Bounce", types.get(4), 5));
		moves.add(new PokemonMove(90, "Volt Tackle", types.get(6), 15));
		moves.add(new PokemonMove(91, "Magical Leaf", types.get(5), 20));
		moves.add(new PokemonMove(92, "Water Sport", types.get(3), 15));
		moves.add(new PokemonMove(93, "Leaf Blade", types.get(5), 15));
		moves.add(new PokemonMove(94, "Shock Wave", types.get(6), 20));
		moves.add(new PokemonMove(95, "Water Pulse", types.get(3), 20));
		moves.add(new PokemonMove(96, "Roost", types.get(4), 10));
		moves.add(new PokemonMove(97, "Brine", types.get(3), 10));
		moves.add(new PokemonMove(98, "Pluck", types.get(4), 20));
		moves.add(new PokemonMove(99, "Tailwind", types.get(4), 15));
		moves.add(new PokemonMove(100, "U-turn", types.get(0), 20));
		moves.add(new PokemonMove(101, "Worry Seed", types.get(5), 10));
		moves.add(new PokemonMove(102, "Aqua Ring", types.get(3), 20));
		moves.add(new PokemonMove(103, "Magnet Rise", types.get(6), 10));
		moves.add(new PokemonMove(104, "Flare Blitz", types.get(1), 15));
		moves.add(new PokemonMove(105, "Aqua Tail", types.get(3), 10));
		moves.add(new PokemonMove(106, "Seed Bomb", types.get(5), 15));
		moves.add(new PokemonMove(107, "Air Slash", types.get(4), 15));
		moves.add(new PokemonMove(108, "X-Scissor", types.get(0), 15));
		moves.add(new PokemonMove(109, "Bug Buzz", types.get(0), 10));
		moves.add(new PokemonMove(110, "Energy Ball", types.get(5), 10));
		moves.add(new PokemonMove(111, "Brave Bird", types.get(4), 15));
		moves.add(new PokemonMove(112, "Shadow Claw", types.get(2), 15));
		moves.add(new PokemonMove(113, "Thunder Fang", types.get(6), 15));
		moves.add(new PokemonMove(114, "Fire Fang", types.get(1), 15));
		moves.add(new PokemonMove(115, "Shadow Sneak", types.get(2), 30));
		moves.add(new PokemonMove(116, "Defog", types.get(4), 15));
		moves.add(new PokemonMove(117, "Discharge", types.get(6), 15));
		moves.add(new PokemonMove(118, "Lava Plume", types.get(1), 15));
		moves.add(new PokemonMove(119, "Leaf Storm", types.get(5), 5));
		moves.add(new PokemonMove(120, "Power Whip", types.get(5), 10));
		moves.add(new PokemonMove(121, "Grass Knot", types.get(5), 20));
		moves.add(new PokemonMove(122, "Chatter", types.get(4), 20));
		moves.add(new PokemonMove(123, "Bug Bite", types.get(0), 20));
		moves.add(new PokemonMove(124, "Charge Beam", types.get(6), 10));
		moves.add(new PokemonMove(125, "Wood Hammer", types.get(5), 15));
		moves.add(new PokemonMove(126, "Aqua Jet", types.get(3), 20));
		moves.add(new PokemonMove(127, "Attack Order", types.get(0), 15));
		moves.add(new PokemonMove(128, "Defend Order", types.get(0), 10));
		moves.add(new PokemonMove(129, "Heal Order", types.get(0), 10));
		moves.add(new PokemonMove(130, "Magma Storm", types.get(1), 5));
		moves.add(new PokemonMove(131, "Seed Flare", types.get(5), 5));
		moves.add(new PokemonMove(132, "Ominous Wind", types.get(2), 5));
		moves.add(new PokemonMove(133, "Shadow Force", types.get(2), 5));
		moves.add(new PokemonMove(134, "Rage Powder", types.get(0), 20));
		moves.add(new PokemonMove(135, "Flame Burst", types.get(1), 15));
		moves.add(new PokemonMove(136, "Quiver Dance", types.get(0), 20));
		moves.add(new PokemonMove(137, "Electro Ball", types.get(6), 10));
		moves.add(new PokemonMove(138, "Soak", types.get(3), 20));
		moves.add(new PokemonMove(139, "Flame Charge", types.get(1), 20));
		moves.add(new PokemonMove(140, "Scald", types.get(3), 15));
		moves.add(new PokemonMove(141, "Hex", types.get(2), 10));
		moves.add(new PokemonMove(142, "Sky Drop", types.get(4), 10));
		moves.add(new PokemonMove(143, "Incinerate", types.get(1), 15));
		moves.add(new PokemonMove(144, "Acrobatics", types.get(4), 15));
		moves.add(new PokemonMove(145, "Inferno", types.get(1), 5));
		moves.add(new PokemonMove(146, "Water Pledge", types.get(3), 10));
		moves.add(new PokemonMove(147, "Fire Pledge", types.get(1), 10));
		moves.add(new PokemonMove(148, "Grass Pledge", types.get(5), 10));
		moves.add(new PokemonMove(149, "Volt Switch", types.get(6), 20));
		moves.add(new PokemonMove(150, "Struggle Bug", types.get(0), 20));
		moves.add(new PokemonMove(151, "Electroweb", types.get(6), 15));
		moves.add(new PokemonMove(152, "Wild Charge", types.get(6), 15));
		moves.add(new PokemonMove(153, "Horn Leech", types.get(5), 10));
		moves.add(new PokemonMove(154, "Razor Shell", types.get(3), 10));
		moves.add(new PokemonMove(155, "Heat Crash", types.get(1), 10));
		moves.add(new PokemonMove(156, "Leaf Tornado", types.get(5), 10));
		moves.add(new PokemonMove(157, "Steamroller", types.get(0), 20));
		moves.add(new PokemonMove(158, "Cotton Guard", types.get(5), 10));
		moves.add(new PokemonMove(159, "Hurricane", types.get(4), 10));
		moves.add(new PokemonMove(160, "Searing Shot", types.get(1), 5));
		moves.add(new PokemonMove(161, "Bolt Strike", types.get(6), 5));
		moves.add(new PokemonMove(162, "Blue Flare", types.get(1), 5));
		moves.add(new PokemonMove(163, "Fiery Dance", types.get(1), 10));
		moves.add(new PokemonMove(164, "V-create", types.get(1), 5));
		moves.add(new PokemonMove(165, "Fusion Flare", types.get(1), 5));
		moves.add(new PokemonMove(166, "Fusion Bolt", types.get(6), 5));
		moves.add(new PokemonMove(167, "Sticky Web", types.get(0), 20));
		moves.add(new PokemonMove(168, "Fell Stinger", types.get(0), 25));
		moves.add(new PokemonMove(169, "Phantom Force", types.get(2), 10));
		moves.add(new PokemonMove(170, "Trick-or-Treat", types.get(2), 20));
		moves.add(new PokemonMove(171, "Ion Deluge", types.get(6), 25));
		moves.add(new PokemonMove(172, "Parabolic Charge", types.get(6), 20));
		moves.add(new PokemonMove(173, "Forest's Curse", types.get(5), 20));
		moves.add(new PokemonMove(174, "Petal Blizzard", types.get(5), 15));
		moves.add(new PokemonMove(175, "Grassy Terrain", types.get(5), 10));
		moves.add(new PokemonMove(176, "Electrify", types.get(6), 20));
		moves.add(new PokemonMove(177, "Steam Eruption", types.get(3), 5));
		moves.add(new PokemonMove(178, "Water Shuriken*", types.get(3), 20));
		moves.add(new PokemonMove(179, "Mystical Fire", types.get(1), 10));
		moves.add(new PokemonMove(180, "Spiky Shield", types.get(5), 10));
		moves.add(new PokemonMove(181, "Eerie Impulse", types.get(6), 15));
		moves.add(new PokemonMove(182, "Powder", types.get(0), 20));
		moves.add(new PokemonMove(183, "Magnetic Flux", types.get(6), 20));
		moves.add(new PokemonMove(184, "Electric Terrain", types.get(6), 10));
		moves.add(new PokemonMove(185, "Nuzzle", types.get(6), 20));
		moves.add(new PokemonMove(186, "Infestation", types.get(0), 20));
		moves.add(new PokemonMove(187, "Oblivion Wing", types.get(4), 10));
		moves.add(new PokemonMove(188, "Origin Pulse", types.get(3), 10));
		moves.add(new PokemonMove(189, "Dragon Ascent", types.get(4), 5));
		moves.add(new PokemonMove(190, "Supersonic Skystrike", types.get(4), 1));
		moves.add(new PokemonMove(191, "Supersonic Skystrike", types.get(4), 1));
		moves.add(new PokemonMove(192, "Savage Spin-Out", types.get(0), 1));
		moves.add(new PokemonMove(193, "Savage Spin-Out", types.get(0), 1));
		moves.add(new PokemonMove(194, "Never-Ending Nightmare", types.get(2), 1));
		moves.add(new PokemonMove(195, "Never-Ending Nightmare", types.get(2), 1));
		moves.add(new PokemonMove(196, "Inferno Overdrive", types.get(1), 1));
		moves.add(new PokemonMove(197, "Inferno Overdrive", types.get(1), 1));
		moves.add(new PokemonMove(198, "Hydro Vortex", types.get(3), 1));
		moves.add(new PokemonMove(199, "Hydro Vortex", types.get(3), 1));
		moves.add(new PokemonMove(200, "Bloom Doom", types.get(5), 1));
		moves.add(new PokemonMove(201, "Bloom Doom", types.get(5), 1));
		moves.add(new PokemonMove(202, "Gigavolt Havoc", types.get(6), 1));
		moves.add(new PokemonMove(203, "Gigavolt Havoc", types.get(6), 1));
		moves.add(new PokemonMove(204, "Catastropika", types.get(6), 1));
		moves.add(new PokemonMove(205, "First Impression", types.get(0), 10));
		moves.add(new PokemonMove(206, "Spirit Shackle", types.get(2), 10));
		moves.add(new PokemonMove(207, "Sparkling Aria", types.get(3), 10));
		moves.add(new PokemonMove(208, "Strength Sap", types.get(5), 10));
		moves.add(new PokemonMove(209, "Solar Blade", types.get(5), 10));
		moves.add(new PokemonMove(210, "Leafage", types.get(5), 40));
		moves.add(new PokemonMove(211, "Pollen Puff", types.get(0), 15));
		moves.add(new PokemonMove(212, "Lunge", types.get(0), 15));
		moves.add(new PokemonMove(213, "Fire Lash", types.get(1), 15));
		moves.add(new PokemonMove(214, "Burn Up", types.get(1), 5));
		moves.add(new PokemonMove(215, "Trop Kick", types.get(5), 15));
		moves.add(new PokemonMove(216, "Beak Blast", types.get(4), 15));
		moves.add(new PokemonMove(217, "Sinister Arrow Raid", types.get(2), 1));
		moves.add(new PokemonMove(218, "Oceanic Operetta", types.get(3), 1));
		moves.add(new PokemonMove(219, "Soul-Stealing 7-Star Strike", types.get(2), 1));
		moves.add(new PokemonMove(220, "Stoked Sparksurfer", types.get(6), 1));
		moves.add(new PokemonMove(221, "Shell Trap", types.get(1), 5));
		moves.add(new PokemonMove(222, "Shadow Bone", types.get(2), 10));
		moves.add(new PokemonMove(223, "Liquidation", types.get(3), 10));
		moves.add(new PokemonMove(224, "Spectral Thief", types.get(2), 10));
		moves.add(new PokemonMove(225, "Moongeist Beam", types.get(2), 5));
		moves.add(new PokemonMove(226, "Zing Zap", types.get(6), 10));
		moves.add(new PokemonMove(227, "10,000,000 Volt Thunderbolt", types.get(6), 1));
		moves.add(new PokemonMove(228, "Mind Blown", types.get(1), 5));
		moves.add(new PokemonMove(229, "Plasma Fists", types.get(6), 15));
		moves.add(new PokemonMove(230, "Menacing Moonraze Maelstrom", types.get(2), 1));
		moves.add(new PokemonMove(231, "Zippy Zap", types.get(6), 15));
		moves.add(new PokemonMove(232, "Splishy Splash", types.get(3), 15));
		moves.add(new PokemonMove(233, "Floaty Fall", types.get(4), 15));
		moves.add(new PokemonMove(234, "Pika Papow", types.get(6), 20));
		moves.add(new PokemonMove(235, "Bouncy Bubble", types.get(3), 15));
		moves.add(new PokemonMove(236, "Buzzy Buzz", types.get(6), 15));
		moves.add(new PokemonMove(237, "Sizzly Slide", types.get(1), 15));
		moves.add(new PokemonMove(238, "Sappy Seed", types.get(5), 15));
	}

	@Override
	public int save(PokemonMove move) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<PokemonMove> findAll() {
		return moves;
	}

	@Override
	public List<PokemonMove> findByTypeName(String typeName) {
		// TODO Auto-generated method stub
		return null;
	}

}

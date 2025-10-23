import matplotlib.pyplot as plt
import matplotlib.patches as patches

# Create a figure
fig, ax = plt.subplots(figsize=(6, 6))

# Block outline
ax.add_patch(patches.Rectangle((0.1, 0.1), 0.8, 0.8, fill=False, linewidth=2))

# Block Header section
ax.add_patch(patches.Rectangle((0.1, 0.7), 0.8, 0.2, fill=False, linewidth=2))
ax.text(0.5, 0.8, "Block Header (80 bytes)", ha="center", va="center", fontsize=10, weight="bold")

# Subsections inside Block Header
header_fields = [
    "Version (4 bytes)", "Previous Block Hash (32 bytes)", 
    "Merkle Root (32 bytes)", "Timestamp (4 bytes)", 
    "Difficulty Target (4 bytes)", "Nonce (4 bytes)"
]
y = 0.85
for field in header_fields:
    y -= 0.025
    ax.text(0.5, y, field, ha="center", va="center", fontsize=8)

# Block Body section
ax.add_patch(patches.Rectangle((0.1, 0.1), 0.8, 0.6, fill=False, linewidth=2))
ax.text(0.5, 0.4, "Block Body\n- Transaction Counter\n- Transactions List", 
        ha="center", va="center", fontsize=9)

# Formatting
ax.set_xlim(0, 1)
ax.set_ylim(0, 1)
ax.axis("off")

plt.show()

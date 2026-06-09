import qrcode

# Google Form URL
url = "https://docs.google.com/forms/d/e/1FAIpQLSc2R8vWW1ldVVcK086hv4SCPLlXk7jLloEd1XV6W_hJy4QglA/viewform?usp=publish-editor"

# Create QR Code
qr = qrcode.QRCode(
    version=1,
    error_correction=qrcode.constants.ERROR_CORRECT_H,
    box_size=10,
    border=4,
)

qr.add_data(url)
qr.make(fit=True)

# Generate image
img = qr.make_image(fill_color="black", back_color="white")

# Save image
img.save("IIC Quest 4.0 Feedback Form QR.png")

print("QR Code saved as IIC_Quest_Google_Form_QR.png")

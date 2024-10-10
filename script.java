document.getElementById('topupForm').addEventListener('submit', function(event) {
    event.preventDefault();

    const game = document.getElementById('game').value;
    const amount = document.getElementById('amount').value;
    const message = document.getElementById('message');

    message.textContent = `Top Up ${amount} untuk ${game} berhasil!`;
    message.style.color = 'green';

    // Reset form
    this.reset();
});

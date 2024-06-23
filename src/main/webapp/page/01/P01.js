// script.js  
function startLottery() {
    // 先将所有格子恢复原状  
    const items = document.querySelectorAll('.grid-item');
    items.forEach(item => item.classList.remove('active'));

    // 随机选择一个格子并高亮  
    const randomIndex = Math.floor(Math.random() * items.length);
    const winningItem = items[randomIndex];
    winningItem.classList.add('active');

    // 模拟动画效果，比如高亮持续一段时间后恢复原状  
    setTimeout(() => {
        winningItem.classList.remove('active');
        alert(`恭喜您，抽中了${winningItem.textContent}号奖品！`);
    }, 2000); // 2秒后恢复原状并弹出提示  
}
import pyautogui
# https://pyautogui.readthedocs.io/en/latest/
# https://wikidocs.net/85581

# print("곧 시작합니다...")
# pyautogui.countdown(3)
# print("자동화 시작")

# 메시지 alert("메시지 내용", "메시지박스 제목")
# pyautogui.alert("자동화 수행에 실패하였습니다.", "경고")

# 메시지 confirm("메시지 내용", "메시지박스 제목")
# pyautogui.confirm("계속 진행하시겠습니까?", "확인")
# print(result)

# 메세지 입력값 받기 prompt
# result = pyautogui.prompt("파일명을 무엇으로 하시겠습니까?", "입력")
# print(result)

# 암호입력 
result = pyautogui.password("암호를 대라")
print(result)


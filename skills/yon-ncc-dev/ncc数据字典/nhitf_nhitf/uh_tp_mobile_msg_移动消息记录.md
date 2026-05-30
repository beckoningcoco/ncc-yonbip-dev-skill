# |<<

**移动消息记录 (uh_tp_mobile_msg / com.yonyou.yh.nhis.itf.sds.vo.TPMobileMsgVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6283.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_msg | 消息主键 | pk_msg | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(50) |  | 字符串 (String) |
| 3 | pk_org | 所属机构 | pk_org | varchar(50) |  | 字符串 (String) |
| 4 | pk_acc | 账户主键 | pk_acc | varchar(50) |  | 字符串 (String) |
| 5 | cndv_idnf_no | 访问设备识别编号 | cndv_idnf_no | varchar(50) |  | 字符串 (String) |
| 6 | cndv_os_cd | 访问设备运行系统编号 | cndv_os_cd | varchar(2) |  | 字符串 (String) |
| 7 | pat_telno | 手机号 | pat_telno | varchar(20) |  | 字符串 (String) |
| 8 | eu_msgtype | 消息分类 | eu_msgtype | int |  | 整数 (Integer) |
| 9 | msg_date | 消息日期 | msg_date | char(19) |  | 日期 (UFDate) |
| 10 | msg_txt | 消息内容 | msg_txt | varchar(4000) |  | 字符串 (String) |
| 11 | msg_result_code | 消息处理结果 | msg_result_code | varchar(2) |  | 字符串 (String) |
| 12 | msg_result_txt | 消息处理结果内容 | msg_result_txt | varchar(4000) |  | 字符串 (String) |
| 13 | note | 备注 | note | varchar(256) |  | 字符串 (String) |
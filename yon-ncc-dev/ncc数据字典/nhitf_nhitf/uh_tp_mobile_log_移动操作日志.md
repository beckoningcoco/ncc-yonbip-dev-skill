# |<<

**移动操作日志 (uh_tp_mobile_log / com.yonyou.yh.nhis.itf.sds.vo.TPMobileLogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6281.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_log | 操作主键 | pk_log | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(50) |  | 字符串 (String) |
| 3 | pk_org | 所属机构 | pk_org | varchar(50) |  | 字符串 (String) |
| 4 | pk_acc | 账户主键 | pk_acc | varchar(50) |  | 字符串 (String) |
| 5 | cndv_idnf_no | 访问设备识别编号 | cndv_idnf_no | varchar(50) |  | 字符串 (String) |
| 6 | cndv_os_cd | 访问设备运行系统编号 | cndv_os_cd | varchar(2) |  | 字符串 (String) |
| 7 | pat_telno | 手机号 | pat_telno | varchar(20) |  | 字符串 (String) |
| 8 | oper_code | 操作编码 | oper_code | varchar(50) |  | 字符串 (String) |
| 9 | input | 输入参数字符串 | input | varchar(256) |  | 字符串 (String) |
| 10 | output | 输出参数字符串 | output | varchar(4000) |  | 字符串 (String) |
| 11 | oper_result_code | 操作结果代码 | oper_result_code | varchar(2) |  | 字符串 (String) |
| 12 | oper_date | 操作日期 | oper_date | char(19) |  | 日期 (UFDate) |
| 13 | note | 备注 | note | varchar(256) |  | 字符串 (String) |
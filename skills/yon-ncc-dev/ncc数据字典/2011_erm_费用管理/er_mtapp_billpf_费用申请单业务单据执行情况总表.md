# |<<

**费用申请单业务单据执行情况总表 (er_mtapp_billpf / nc.vo.erm.matterappctrl.MtappbillpfVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1907.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mtapp_billpf | 主键 | pk_mtapp_billpf | char(20) | √ | 主键 (UFID) |
| 2 | pk_matterapp | 费用申请单 | pk_matterapp | varchar(20) |  | 费用申请单 (mtapp_bill) |
| 3 | pk_mtapp_detail | 费用申请单明细 | pk_mtapp_detail | varchar(20) |  | 费用申请单明细 (mtapp_detail) |
| 4 | busisys | 业务系统 | busisys | varchar(20) |  | 模块信息 (module) |
| 5 | pk_djdl | 业务单据大类 | pk_djdl | varchar(50) |  | 字符串 (String) |
| 6 | exe_amount | 执行数 | exe_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | pre_amount | 预占数 | pre_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 9 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 10 | creator | 创建人 | creator | varchar(50) |  | 字符串 (String) |
| 11 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 12 | modifier | 最后修改人 | modifier | varchar(50) |  | 字符串 (String) |
| 13 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
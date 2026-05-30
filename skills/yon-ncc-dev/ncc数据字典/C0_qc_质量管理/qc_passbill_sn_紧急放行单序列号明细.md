# |<<

**紧急放行单序列号明细 (qc_passbill_sn / nc.vo.qc.c005.entity.PassBillSnVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4849.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_passbill_sn | 紧急放行单序列号明细 | pk_passbill_sn | char(20) | √ | 主键 (UFID) |
| 2 | pk_serialno | 序列号主键 | pk_serialno | varchar(20) |  | 字符串 (String) |
| 3 | vsncode | 序列号 | vsncode | varchar(128) |  | 字符串 (String) |
| 4 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 5 | pk_org | 质检中心最新版本 | pk_org | varchar(20) |  | 组织_业务单元_质检中心 (qccenter) |
| 6 | pk_org_v | 质检中心 | pk_org_v | varchar(20) |  | 组织_业务单元_质检中心版本信息 (qccenter_v) |
| 7 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 8 | nsnnum | 序列号主数量 | nsnnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | nsnastnum | 序列号数量 | nsnastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | pk_passbill | 紧急放行单主键 | pk_passbill | varchar(20) |  | 字符串 (String) |
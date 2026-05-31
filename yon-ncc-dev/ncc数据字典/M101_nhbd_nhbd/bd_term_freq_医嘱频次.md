# |<<

**医嘱频次 (bd_term_freq / nc.vo.nhbd.mk.OrdFreqVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1005.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_freq | 频次主键 | pk_freq | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | freqcode | 频次编码 | freqcode | varchar(30) | √ | 字符串 (String) |
| 5 | freqname | 频次名称 | freqname | varchar(50) | √ | 字符串 (String) |
| 6 | freqct | 频次次数分子 | freqct | int | √ | 整数 (Integer) |
| 7 | unitct | 频次数目分母 | unitct | int | √ | 整数 (Integer) |
| 8 | pk_frequnit | 频次单位 | pk_frequnit | varchar(20) |  | 频次单位(自定义档案) (Defdoc-060100) |
| 9 | dt_frequnit | 频次单位编码 | dt_frequnit | varchar(50) |  | 字符串 (String) |
| 10 | freqdesc | 频次描述 | freqdesc | varchar(256) |  | 字符串 (String) |
| 11 | mnecode | 助记符 | mnecode | varchar(30) |  | 字符串 (String) |
| 12 | flag_day_bill | 按天计费标识 | flag_day_bill | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | flag_day_bill_clinic | 非药品按天计费标识 | flag_day_bill_clinic | char(1) |  | 布尔类型 (UFBoolean) | N |
| 14 | flag_day_bill_drug | 药品按天计费标识 | flag_day_bill_drug | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | maketime | 制单时间 | maketime | char(19) | √ | 日期时间 (UFDateTime) |
| 16 | lastmaketime | 最后修改时间 | lastmaketime | char(19) |  | 日期时间 (UFDateTime) |
| 17 | billno | 单据号 | billno | varchar(50) |  | 字符串 (String) |
| 18 | busitype | 业务类型 | busitype | varchar(50) |  | 字符串 (String) |
| 19 | billmaker | 制单人 | billmaker | varchar(50) |  | 字符串 (String) |
| 20 | approver | 审批人 | approver | varchar(50) |  | 字符串 (String) |
| 21 | approvestatus | 审批状态 | approvestatus | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |
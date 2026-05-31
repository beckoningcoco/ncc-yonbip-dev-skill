# |<<

**医院审批信息 (uh_hp_hosapply / com.yonyou.yh.nhis.hp.hp.vo.HpHosApplyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6118.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hosapply | 主键 | pk_hosapply | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | apply_cate | 审批类别 | apply_cate | varchar(3) |  | 字符串 (String) |
| 5 | num_personal | 个人编号 | num_personal | varchar(14) |  | 字符串 (String) |
| 6 | num_unit | 单位编号 | num_unit | varchar(14) |  | 字符串 (String) |
| 7 | idno | 身份证号 | idno | varchar(18) |  | 字符串 (String) |
| 8 | patiname | 姓名 | patiname | varchar(20) |  | 字符串 (String) |
| 9 | zylsh | 住院流水号 | zylsh | varchar(18) |  | 字符串 (String) |
| 10 | hosname | 转外就诊医院名称 | hosname | varchar(50) |  | 字符串 (String) |
| 11 | hos_level | 医院等级 | hos_level | varchar(3) |  | 字符串 (String) |
| 12 | pk_hpitem | 病种主键 | pk_hpitem | varchar(50) |  | 字符串 (String) |
| 13 | hpitemcode | 病种编码 | hpitemcode | varchar(20) |  | 字符串 (String) |
| 14 | hpitemname | 病种名称 | hpitemname | varchar(50) |  | 字符串 (String) |
| 15 | hos_opinion | 医院意见 | hos_opinion | varchar(100) |  | 字符串 (String) |
| 16 | pk_srv | 项目主键 | pk_srv | varchar(50) |  | 字符串 (String) |
| 17 | srvcode | 项目编码 | srvcode | varchar(20) |  | 字符串 (String) |
| 18 | srvname | 项目名称 | srvname | varchar(100) |  | 字符串 (String) |
| 19 | num_apply | 审批数量 | num_apply | varchar(6) |  | 字符串 (String) |
| 20 | date_apply | 医院审批日期 | date_apply | char(19) |  | 日期时间 (UFDateTime) |
| 21 | date_begin | 开始时间 | date_begin | char(19) |  | 日期时间 (UFDateTime) |
| 22 | date_end | 结束时间 | date_end | char(19) |  | 日期时间 (UFDateTime) |
| 23 | psn_oper | 经办人 | psn_oper | varchar(20) |  | 字符串 (String) |
| 24 | status_report | 上报状态 | status_report | int |  | 上报状态 (enum) |  | 0=未上报; |
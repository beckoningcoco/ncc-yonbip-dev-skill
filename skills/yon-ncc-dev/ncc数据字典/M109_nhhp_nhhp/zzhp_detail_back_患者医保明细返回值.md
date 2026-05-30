# |<<

**患者医保明细返回值 (zzhp_detail_back / com.yonyou.yh.nhis.hp.zzhp.pub.vo.HpDetailBackVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6394.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hpdetail | 主键 | pk_hpdetail | char(20) | √ | 主键 (UFID) |
| 2 | pk_pi | 患者主键 | pk_pi | varchar(20) |  | 患者基本信息 (pati) |
| 3 | pk_pv | 就诊主键 | pk_pv | varchar(20) |  | 患者就诊 (PatiVisitVO) |
| 4 | patiname | 患者姓名 | patiname | varchar(50) |  | 字符串 (String) |
| 5 | hpcard | 医保卡号 | hpcard | varchar(50) |  | 字符串 (String) |
| 6 | flag_use | 是否作废 | flag_use | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | outtreatmoey | 超出治疗方案金额 | outtreatmoey | decimal(14, 2) |  | 数值 (UFDouble) |
| 8 | selfmoney | 自理金额 | selfmoney | decimal(14, 2) |  | 数值 (UFDouble) |
| 9 | privatemoney | 自费金额 | privatemoney | decimal(14, 2) |  | 数值 (UFDouble) |
| 10 | chargelevel | 收费项目等级 | chargelevel | decimal(14, 2) |  | 数值 (UFDouble) |
| 11 | payratio | 自付比例 | payratio | decimal(14, 2) |  | 数值 (UFDouble) |
| 12 | outlimitpay | 超限价自付金额 | outlimitpay | decimal(14, 2) |  | 数值 (UFDouble) |
| 13 | pk_psn | 操作人 | pk_psn | varchar(50) |  | 字符串 (String) |
| 14 | psnname | 操作人姓名 | psnname | varchar(50) |  | 字符串 (String) |
| 15 | srvname | 服务名称 | srvname | varchar(256) |  | 字符串 (String) |
| 16 | hissrvcode | HIS编码 | hissrvcode | varchar(50) |  | 字符串 (String) |
| 17 | hpsrvcode | 医保编码 | hpsrvcode | varchar(50) |  | 字符串 (String) |
| 18 | price | 单价 | price | decimal(14, 2) |  | 数值 (UFDouble) |
| 19 | quan | 数量 | quan | decimal(14, 2) |  | 数值 (UFDouble) |
| 20 | amount | 金额 | amount | decimal(14, 2) |  | 数值 (UFDouble) |
| 21 | pk_hp | 医保计划 | pk_hp | varchar(20) |  | 医保计划 (healthplan) |
| 22 | hpcode | 医保计划编码 | hpcode | varchar(50) |  | 字符串 (String) |
| 23 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 24 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 25 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 26 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
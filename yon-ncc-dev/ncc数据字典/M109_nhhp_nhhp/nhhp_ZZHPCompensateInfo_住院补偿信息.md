# |<<

**住院补偿信息 (nhhp_ZZHPCompensateInfo / com.yonyou.yh.nhis.hp.zz.countryside.vo.ZZHPCompensateInfoVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3831.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bcinfo | 住院补偿信息主键 | pk_bcinfo | char(20) | √ | 主键 (UFID) |
| 2 | local_code | 所属地区代码 | local_code | varchar(50) |  | 字符串 (String) |
| 3 | local_name | 所属地区名称 | local_name | varchar(50) |  | 字符串 (String) |
| 4 | pv_type | 就诊类型 | pv_type | varchar(50) |  | 字符串 (String) |
| 5 | inhosumpay | 住院总费用 | inhosumpay | decimal(14, 2) |  | 数值 (UFDouble) |
| 6 | inhosumpay_compensate | 可补偿住院总费用 | inhosumpay_compensate | varchar(14) |  | 字符串 (String) |
| 7 | real_compen | 实际补偿金额 | real_compen | varchar(14) |  | 字符串 (String) |
| 8 | basepay_stand | 起付标准 | basepay_stand | varchar(50) |  | 字符串 (String) |
| 9 | hosswifnum | 住院流水号 | hosswifnum | varchar(50) |  | 字符串 (String) |
| 10 | compen_date | 补偿日期 | compen_date | char(10) |  | 模糊日期 (UFLiteralDate) |
| 11 | info_compensate | 补偿信息说明 | info_compensate | varchar(50) |  | 字符串 (String) |
| 12 | beyondpay_byhos | 医院承担的超出限额部分费用 | beyondpay_byhos | varchar(50) |  | 字符串 (String) |
| 13 | ownpay_info | 自付费用信息 | ownpay_info | varchar(50) |  | 字符串 (String) |
| 14 | compen_flag | 特殊补偿标志 | compen_flag | varchar(50) |  | 字符串 (String) |
| 15 | infecdrug_pay | 抗感染药物费用 | infecdrug_pay | decimal(14, 2) |  | 数值 (UFDouble) |
| 16 | bloodgoods_pay | 血液制品费用 | bloodgoods_pay | varchar(14) |  | 字符串 (String) |
| 17 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 18 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 19 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 20 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
# |<<

**发票_项目 (uh_bl_inv_item / com.yonyou.yh.nhis.bl.inv.vo.BlInvItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5935.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invitem | 发票项目主键 | pk_invitem | char(20) | √ | 主键 (UFID) |
| 2 | pk_invitem | 发票项目主键 | pk_invitem | char(20) | √ | 主键 (UFID) |
| 3 | pk_group | 集团主键 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 5 | pk_inv | 发票结算主键 | pk_inv | varchar(20) |  | 字符串 (String) |
| 6 | code_item | 发票项目编码 | code_item | varchar(30) |  | 字符串 (String) |
| 7 | name_item | 发票项目名称 | name_item | varchar(50) |  | 字符串 (String) |
| 8 | amt_item | 项目金额 | amt_item | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | amt_pati | 患者自付部分 | amt_pati | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | pk_pvtype | 就诊类型 | pk_pvtype | varchar(20) |  | 就诊类型 (pvtype) |
| 11 | def1 | 自定义项1 | def1 | varchar(50) |  | 字符串 (String) |
| 12 | def2 | 自定义项2 | def2 | varchar(50) |  | 字符串 (String) |
| 13 | def3 | 自定义项3 | def3 | varchar(50) |  | 字符串 (String) |
| 14 | def4 | 自定义项4 | def4 | varchar(50) |  | 字符串 (String) |
| 15 | def5 | 自定义项5 | def5 | varchar(50) |  | 字符串 (String) |
| 16 | def6 | 自定义项6 | def6 | varchar(50) |  | 字符串 (String) |
| 17 | def7 | 自定义项7 | def7 | varchar(50) |  | 字符串 (String) |
| 18 | def8 | 自定义项8 | def8 | varchar(50) |  | 字符串 (String) |
| 19 | def9 | 自定义项9 | def9 | varchar(50) |  | 字符串 (String) |
| 20 | def10 | 自定义项10 | def10 | varchar(50) |  | 字符串 (String) |
| 21 | def11 | 自定义项11 | def11 | varchar(50) |  | 字符串 (String) |
| 22 | def12 | 自定义项12 | def12 | varchar(50) |  | 字符串 (String) |
| 23 | def13 | 自定义项13 | def13 | varchar(50) |  | 字符串 (String) |
| 24 | def14 | 自定义项14 | def14 | varchar(50) |  | 字符串 (String) |
| 25 | def15 | 自定义项15 | def15 | varchar(50) |  | 字符串 (String) |
| 26 | def16 | 自定义项16 | def16 | varchar(50) |  | 字符串 (String) |
| 27 | def17 | 自定义项17 | def17 | varchar(50) |  | 字符串 (String) |
| 28 | def18 | 自定义项18 | def18 | varchar(50) |  | 字符串 (String) |
| 29 | def19 | 自定义项19 | def19 | varchar(50) |  | 字符串 (String) |
| 30 | def20 | 自定义项20 | def20 | varchar(50) |  | 字符串 (String) |
| 31 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 32 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 33 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 34 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
# |<<

**医保计划-收费项目 (bd_uh_hp_item / com.yonyou.yh.nhis.bd.healthplan.vo.HpUhItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1035.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hpitem | 医保计划服务主键 | pk_hpitem | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_hp | 医保计划 | pk_hp | varchar(20) |  | 医保计划 (healthplan) |
| 5 | pk_item | 医疗服务收费项目字典 | pk_item | varchar(20) |  | 医疗服务收费项目字典 (bduhitem) |
| 6 | code_hp | 医保服务项目编码 | code_hp | varchar(50) |  | 字符串 (String) |
| 7 | cate_hp | 医保分类编码 | cate_hp | varchar(50) |  | 字符串 (String) |
| 8 | pk_hptype | 支付类型 | pk_hptype | varchar(20) |  | 医保目录类型(自定义档案) (Defdoc-040001) |
| 9 | dt_hptype | 支付类型编码 | dt_hptype | varchar(50) |  | 字符串 (String) |
| 10 | radio | 金额自付比例 | radio | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | price | 单价上限 | price | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | date_begin | 开始日期 | date_begin | char(19) |  | 日期(开始) (UFDateBegin) |
| 13 | date_end | 结束日期 | date_end | char(19) |  | 日期(结束) (UFDateEnd) |
| 14 | note | 描述 | note | varchar(200) |  | 备注 (Memo) |
| 15 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 16 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 17 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 19 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 20 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |
| 35 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 36 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 37 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
| 38 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
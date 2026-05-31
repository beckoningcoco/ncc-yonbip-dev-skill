# |<<

**记费_应收 (uh_bl_cg_srv_ar / uh.vo.nhbl.cg.BlCgSrvArVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5929.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cgsrvar | 逻辑主键 | pk_cgsrvar | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_cgsrv | 记费服务 | pk_cgsrv | varchar(50) |  | 字符串 (String) |
| 5 | pk_payer | 付款机构 | pk_payer | varchar(20) |  | 医保付款机构 (PayerVO) |
| 6 | pk_hp | 付款计划 | pk_hp | varchar(20) |  | 医保计划 (healthplan) |
| 7 | pk_hpsegm | 付款段 | pk_hpsegm | char(20) |  | 主键 (UFID) |
| 8 | name_hpsegm | 付款段名称 | name_hpsegm | varchar(50) |  | 字符串 (String) |
| 9 | amt_hp | 付款金额 | amt_hp | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 11 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 12 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 13 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 14 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 15 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 16 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 17 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 19 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 20 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |
| 30 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 31 | creationtime | 创建时间 | creationtime | char(19) |  | 日期 (UFDate) |
| 32 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 33 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期 (UFDate) |
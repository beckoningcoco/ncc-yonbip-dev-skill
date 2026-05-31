# |<<

**医疗执行_输液药品 (uh_ex_ord_tfpd / com.yonyou.yh.nhis.ex.tf.vo.ExTfPdVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6107.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tfpd | 输液药品主键 | pk_tfpd | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_tfrec | 输液记录 | pk_tfrec | varchar(20) |  | 医疗执行_输液记录 (ExTfRecVO) |
| 5 | pk_pd | 物品 | pk_pd | varchar(20) |  | 物料基本信息（多版本） (material) |
| 6 | code_pd | 物品编码 | code_pd | varchar(50) |  | 字符串 (String) |
| 7 | pk_measdoc_md | 医疗单位 | pk_measdoc_md | varchar(20) |  | 计量单位 (measdoc) |
| 8 | quan_md | 用量 | quan_md | decimal(14, 2) |  | 数值 (UFDouble) |
| 9 | pk_measdoc_cur | 物品包装单位_当前 | pk_measdoc_cur | varchar(20) |  | 计量单位 (measdoc) |
| 10 | quan | 总数量 | quan | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | quan_exec | 执行数量 | quan_exec | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | quan_left | 寄存数量 | quan_left | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | date_left | 寄存日期 | date_left | char(19) |  | 日期时间 (UFDateTime) |
| 14 | date_canc | 取消寄存日期 | date_canc | char(19) |  | 日期时间 (UFDateTime) |
| 15 | pk_psn_canc | 取消人 | pk_psn_canc | varchar(20) |  | 人员基本信息 (psndoc) |
| 16 | name_canc | 取消人名称 | name_canc | varchar(50) |  | 字符串 (String) |
| 17 | flag_inc | 加药标志 | flag_inc | char(1) |  | 布尔类型 (UFBoolean) |
| 18 | pk_ord_inc | 关联医嘱 | pk_ord_inc | varchar(50) |  | 字符串 (String) |
| 19 | flag_st | 皮试阳性 | flag_st | char(1) |  | 布尔类型 (UFBoolean) |
| 20 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |
| 40 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 41 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 42 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 43 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
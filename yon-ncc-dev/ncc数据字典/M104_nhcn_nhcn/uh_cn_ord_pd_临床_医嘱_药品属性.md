# |<<

**临床_医嘱_药品属性 (uh_cn_ord_pd / com.yonyou.yh.nhis.cn.ord.v2.vo.CNOrdPdVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6028.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordpd | 医嘱服务物品主键 | pk_ordpd | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_ord | 医嘱编码 | pk_ord | varchar(20) |  | 临床_医嘱 (cnorder) |
| 5 | pk_pd | 物品 | pk_pd | varchar(20) |  | 物料基本信息（多版本） (material) |
| 6 | factor_mb | 换算系数_医疗单位/基本单位 | factor_mb | varchar(50) |  | 字符串 (String) |
| 7 | pk_measdoc_cur | 包装单位_当前 | pk_measdoc_cur | varchar(20) |  | 计量单位 (measdoc) |
| 8 | pk_measdoc_base | 包装单位_基本 | pk_measdoc_base | varchar(20) |  | 计量单位 (measdoc) |
| 9 | factor_cb | 换算系数_当前与基本 | factor_cb | varchar(50) |  | 字符串 (String) |
| 10 | price_cur | 价格_当前包装 | price_cur | decimal(14, 8) |  | 数值 (UFDouble) |
| 11 | quan_exec_base | 执行数量_基本包装 | quan_exec_base | decimal(14, 2) |  | 数值 (UFDouble) |
| 12 | quan_bed_base | 床边数量_基本包装 | quan_bed_base | decimal(14, 2) |  | 数值 (UFDouble) |
| 13 | dt_dispmode | 物品发放模式编码 | dt_dispmode | varchar(50) |  | 字符串 (String) |
| 14 | pk_dispmode | 物品发放模式 | pk_dispmode | varchar(20) |  | 字符串 (String) |
| 15 | def1 | 自定义项1 | def1 | varchar(100) |  | 字符串 (String) |
| 16 | def2 | 自定义项2 | def2 | varchar(100) |  | 字符串 (String) |
| 17 | def3 | 自定义项3 | def3 | varchar(100) |  | 字符串 (String) |
| 18 | def4 | 自定义项4 | def4 | varchar(100) |  | 字符串 (String) |
| 19 | def5 | 自定义项5 | def5 | varchar(100) |  | 字符串 (String) |
| 20 | def6 | 自定义项6 | def6 | varchar(100) |  | 字符串 (String) |
| 21 | def7 | 自定义项7 | def7 | varchar(100) |  | 字符串 (String) |
| 22 | def8 | 自定义项8 | def8 | varchar(100) |  | 字符串 (String) |
| 23 | def9 | 自定义项9 | def9 | varchar(100) |  | 字符串 (String) |
| 24 | def10 | 自定义项10 | def10 | varchar(100) |  | 字符串 (String) |
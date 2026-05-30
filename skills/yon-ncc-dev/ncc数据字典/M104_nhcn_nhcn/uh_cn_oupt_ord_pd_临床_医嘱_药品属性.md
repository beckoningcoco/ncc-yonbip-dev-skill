# |<<

**临床_医嘱_药品属性 (uh_cn_oupt_ord_pd / com.yonyou.yh.nhis.cn.ord.oc.v2.vo.CNOcOrdPdVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6040.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordpd | 医嘱服务物品主键 | pk_ordpd | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 字符串 (String) |
| 4 | pk_ord | 医嘱编码 | pk_ord | varchar(20) |  | 字符串 (String) |
| 5 | pk_pd | 物品 | pk_pd | varchar(20) |  | 字符串 (String) |
| 6 | factor_mb | 换算系数_医疗单位/基本单位 | factor_mb | varchar(50) |  | 字符串 (String) |
| 7 | pk_measdoc_cur | 包装单位_当前 | pk_measdoc_cur | varchar(20) |  | 字符串 (String) |
| 8 | pk_measdoc_base | 包装单位_基本 | pk_measdoc_base | varchar(20) |  | 字符串 (String) |
| 9 | factor_cb | 换算系数_当前与基本 | factor_cb | varchar(50) |  | 字符串 (String) |
| 10 | price_cur | 价格_当前包装 | price_cur | decimal(14, 8) |  | 数值 (UFDouble) |
| 11 | quan_exec_base | 执行数量_基本包装 | quan_exec_base | decimal(14, 2) |  | 数值 (UFDouble) |
| 12 | quan_bed_base | 床边数量_基本包装 | quan_bed_base | decimal(14, 2) |  | 数值 (UFDouble) |
| 13 | dt_dispmode | 物品发放模式编码 | dt_dispmode | varchar(50) |  | 字符串 (String) |
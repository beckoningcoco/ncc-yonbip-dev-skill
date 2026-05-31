# |<<

**临床_医嘱_检验申请单属性 (uh_cn_oupt_ord_lis / com.yonyou.yh.nhis.cn.ord.oc.v2.vo.CNOcOrdLisAppVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6038.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordlis | 医嘱检验申请单属性主键 | pk_ordlis | char(20) | √ | 主键 (UFID) |
| 2 | pk_ord | 医嘱 | pk_ord | varchar(20) |  | 字符串 (String) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 4 | pk_org | 所属机构 | pk_org | varchar(20) |  | 字符串 (String) |
| 5 | pk_diag | 当前诊断 | pk_diag | varchar(20) |  | 字符串 (String) |
| 6 | desc_diag | 当前诊断描述 | desc_diag | varchar(256) |  | 字符串 (String) |
| 7 | purpose_lis | 检验目的 | purpose_lis | varchar(256) |  | 字符串 (String) |
| 8 | pk_samptype | 标本类型 | pk_samptype | varchar(20) |  | 字符串 (String) |
| 9 | dt_samptype | 标本类型编码 | dt_samptype | varchar(50) |  | 字符串 (String) |
| 10 | pk_contype | 试管类型 | pk_contype | varchar(20) |  | 字符串 (String) |
| 11 | dt_contype | 试管类型编码 | dt_contype | varchar(50) |  | 字符串 (String) |
| 12 | pk_colltype | 采集方法 | pk_colltype | varchar(20) |  | 字符串 (String) |
| 13 | dt_colltype | 采集方法编码 | dt_colltype | varchar(50) |  | 字符串 (String) |
| 14 | code_samp | 标本编号 | code_samp | varchar(50) |  | 字符串 (String) |
| 15 | pk_dept_coll | 样本采集科室 | pk_dept_coll | varchar(20) |  | 字符串 (String) |
| 16 | eu_status | 检验过程状态 | eu_status | int |  | 整数 (Integer) |
| 17 | note_lis | 备注 | note_lis | varchar(4000) |  | 字符串 (String) |
| 18 | flag_prt | 打印标志 | flag_prt | char(1) |  | 布尔类型 (UFBoolean) |
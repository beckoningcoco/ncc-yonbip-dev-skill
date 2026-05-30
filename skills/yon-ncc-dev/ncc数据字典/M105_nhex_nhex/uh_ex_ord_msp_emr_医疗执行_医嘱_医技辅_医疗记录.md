# |<<

**医疗执行_医嘱_医技辅_医疗记录 (uh_ex_ord_msp_emr / com.yonyou.yh.nhis.ex.mt.vo.OrdMTAppMspEmrVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6092.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordmspemr | 医技辅执行医疗记录主键 | pk_ordmspemr | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(50) |  | 字符串 (String) |
| 4 | pk_ordmsp | 医技辅执行 | pk_ordmsp | varchar(20) |  | 医疗执行_医嘱_医技辅 (ordmtappmsp) |
| 5 | sortno | 序号 | sortno | int |  | 整数 (Integer) |
| 6 | pk_emr | 对应医疗记录 | pk_emr | varchar(20) |  | 临床_医疗记录 (unCNEmr) |
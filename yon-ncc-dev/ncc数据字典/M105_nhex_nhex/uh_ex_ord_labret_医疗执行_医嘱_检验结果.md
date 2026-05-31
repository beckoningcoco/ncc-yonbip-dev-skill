# |<<

**医疗执行_医嘱_检验结果 (uh_ex_ord_labret / com.yonyou.yh.nhis.ex.mt.vo.OrdMTAppLabRstVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6089.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_labret | 检验结果明细主键 | pk_labret | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(50) |  | 字符串 (String) |
| 4 | pk_ordmt | 医疗执行医嘱医技 | pk_ordmt | varchar(20) |  | 医疗执行_医嘱_医技 (OrdMTApplyVO) |
| 5 | pk_lisret | 检验结果 | pk_lisret | varchar(50) |  | 字符串 (String) |
| 6 | pk_srvtype | 服务类型 | pk_srvtype | varchar(20) |  | 服务类型(自定义档案) (Defdoc-030000) |
| 7 | dt_srvtype | 服务类型编码 | dt_srvtype | varchar(50) |  | 字符串 (String) |
| 8 | sortno | 排序号 | sortno | int |  | 整数 (Integer) |
| 9 | pk_srv | 指标主键 | pk_srv | varchar(50) |  | 字符串 (String) |
| 10 | code_srv | 指标编码 | code_srv | varchar(50) |  | 字符串 (String) |
| 11 | pk_measdoc_med | 医疗单位 | pk_measdoc_med | varchar(20) |  | 计量单位 (measdoc) |
| 12 | stdval_min | 标准下限 | stdval_min | varchar(256) |  | 字符串 (String) |
| 13 | stdval_max | 标准上限 | stdval_max | varchar(256) |  | 字符串 (String) |
| 14 | val | 指标数值 | val | varchar(256) |  | 字符串 (String) |
| 15 | eu_result | 检验结论 | eu_result | int |  | 医疗执行医嘱医技检验结论 (ordexlisresult) |  | -1=低于; |
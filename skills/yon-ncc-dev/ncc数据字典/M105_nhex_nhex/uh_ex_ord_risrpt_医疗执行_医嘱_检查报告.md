# |<<

**医疗执行_医嘱_检查报告 (uh_ex_ord_risrpt / com.yonyou.yh.nhis.ex.mt.vo.OrdMTAppRisRptVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6103.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_risrpt | 检查报告主键 | pk_risrpt | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(50) |  | 字符串 (String) |
| 4 | pk_ordmt | 医疗执行医嘱医技 | pk_ordmt | varchar(20) |  | 医疗执行_医嘱_医技 (OrdMTApplyVO) |
| 5 | pk_srvtype | 服务类型 | pk_srvtype | varchar(20) |  | 服务类型(自定义档案) (Defdoc-030000) |
| 6 | dt_srvtype | 服务类型编码 | dt_srvtype | varchar(50) |  | 字符串 (String) |
| 7 | pk_srv | 检查项目 | pk_srv | varchar(50) |  | 字符串 (String) |
| 8 | code_srv | 检查项目编码 | code_srv | varchar(256) |  | 字符串 (String) |
| 9 | result_obj | 报告结论_客观所见 | result_obj | varchar(4000) |  | 字符串 (String) |
| 10 | result_subj | 报告结论_主观所见 | result_subj | varchar(4000) |  | 字符串 (String) |
| 11 | result | 检查结论 | result | int |  | 医疗执行医嘱检查报告结论 (ordexrisresultenum) |  | 1=正常; |
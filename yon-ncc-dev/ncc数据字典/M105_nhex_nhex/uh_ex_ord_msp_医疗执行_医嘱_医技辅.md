# |<<

**医疗执行_医嘱_医技辅 (uh_ex_ord_msp / com.yonyou.yh.nhis.ex.mt.vo.OrdMTAppMspVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6090.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordmsp | 医疗执行医嘱医技辅主键 | pk_ordmsp | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(50) |  | 字符串 (String) |
| 4 | pk_ordmt | 医疗执行医嘱医技 | pk_ordmt | varchar(20) |  | 医疗执行_医嘱_医技 (OrdMTApplyVO) |
| 5 | pk_srvtype | 服务类型 | pk_srvtype | varchar(20) |  | 服务类型(自定义档案) (Defdoc-030000) |
| 6 | dt_srvtype | 服务类型编码 | dt_srvtype | varchar(50) |  | 字符串 (String) |
| 7 | pk_srv | 服务 | pk_srv | varchar(50) |  | 字符串 (String) |
| 8 | code_srv | 服务名称 | code_srv | varchar(50) |  | 字符串 (String) |
| 9 | quan_exec | 执行数量 | quan_exec | decimal(14, 2) |  | 数值 (UFDouble) |
| 10 | pk_execresult | 执行结果编码 | pk_execresult | varchar(20) |  | 医疗执行结果(自定义档案) (Defdoc-120104) |
| 11 | dt_execresult | 执行结果 | dt_execresult | varchar(50) |  | 字符串 (String) |
| 12 | name_execresult | 执行结果名称 | name_execresult | varchar(50) |  | 字符串 (String) |
| 13 | desc_execresult | 执行结果描述 | desc_execresult | varchar(256) |  | 字符串 (String) |
| 14 | pk_psn_exec | 执行人员 | pk_psn_exec | varchar(20) |  | 人员基本信息 (psndoc) |
| 15 | name_psn_exec | 执行人员名称 | name_psn_exec | varchar(300) |  | 字符串 (String) |
| 16 | date_exec | 执行日期 | date_exec | char(19) |  | 日期时间 (UFDateTime) |
| 17 | pk_emr | 对应医疗记录 | pk_emr | varchar(20) |  | 临床_医疗记录 (unCNEmr) |
| 18 | note | 备注 | note | varchar(50) |  | 字符串 (String) |
| 19 | name_psn_main | 主诊医师名称 | name_psn_main | varchar(300) |  | 字符串 (String) |
| 20 | pk_psn_main | 主诊医师 | pk_psn_main | varchar(20) |  | 字符串 (String) |
| 21 | name_psn_cure | 治疗师名称 | name_psn_cure | varchar(300) |  | 字符串 (String) |
| 22 | pk_psn_cure | 治疗师主键 | pk_psn_cure | varchar(20) |  | 字符串 (String) |
| 23 | name_psn_beauty | 美容师名称 | name_psn_beauty | varchar(300) |  | 字符串 (String) |
| 24 | pk_psn_beauty | 美容师主键 | pk_psn_beauty | varchar(20) |  | 字符串 (String) |
| 25 | name_psn_nurse | 护士名称 | name_psn_nurse | varchar(300) |  | 字符串 (String) |
| 26 | pk_psn_nurse | 护士主键 | pk_psn_nurse | varchar(20) |  | 字符串 (String) |
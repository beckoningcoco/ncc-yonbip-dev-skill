# |<<

**医疗执行_医嘱_配血检验 (uh_ex_ord_bttest / com.yonyou.yh.nhis.ex.mt.vo.OrdMTAppBTTestVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6087.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bttest | 配血检验主键 | pk_bttest | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(50) |  | 字符串 (String) |
| 4 | pk_ordmt | 医疗执行医嘱医技 | pk_ordmt | varchar(20) |  | 医疗执行_医嘱_医技 (OrdMTApplyVO) |
| 5 | pk_srvtype | 服务类型 | pk_srvtype | varchar(20) |  | 服务类型(自定义档案) (Defdoc-030000) |
| 6 | dt_srvtype | 服务类型编码 | dt_srvtype | varchar(50) |  | 字符串 (String) |
| 7 | pk_srv | 输血项目 | pk_srv | varchar(50) |  | 字符串 (String) |
| 8 | code_srv | 输血项目编码 | code_srv | varchar(50) |  | 字符串 (String) |
| 9 | pk_blood_abo | 复检ABO血型 | pk_blood_abo | varchar(20) |  | 血型(自定义档案) (Defdoc-000004) |
| 10 | dt_blood_abo | 复检ABO血型编码 | dt_blood_abo | varchar(50) |  | 字符串 (String) |
| 11 | result_abo | 复检ABO血型结论 | result_abo | int |  | 整数 (Integer) |
| 12 | pk_blood_rh | 复检Rh血型 | pk_blood_rh | varchar(20) |  | RH阴性(自定义档案) (Defdoc-000005) |
| 13 | dt_blood_rh | 复检Rh血型编码 | dt_blood_rh | varchar(50) |  | 字符串 (String) |
| 14 | result_rh | 复检Rh血型结论 | result_rh | varchar(50) |  | 字符串 (String) |
| 15 | result_anti | 不规则抗体筛选结果 | result_anti | varchar(256) |  | 字符串 (String) |
| 16 | result_cross | 交叉配血试验结果 | result_cross | varchar(256) |  | 字符串 (String) |
| 17 | result_otexam | 其它检查结果 | result_otexam | varchar(256) |  | 字符串 (String) |
| 18 | pk_psn_chk | 复检人员 | pk_psn_chk | varchar(20) |  | 人员基本信息 (psndoc) |
| 19 | name_psn_chk | 复检人员名称 | name_psn_chk | varchar(300) |  | 字符串 (String) |
| 20 | pk_psn_cross | 配血人员 | pk_psn_cross | varchar(20) |  | 人员基本信息 (psndoc) |
| 21 | name_psn_cross | 配血人员名称 | name_psn_cross | varchar(300) |  | 字符串 (String) |
| 22 | note | 备注 | note | varchar(256) |  | 字符串 (String) |
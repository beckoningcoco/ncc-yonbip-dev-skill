# |<<

**临床_医嘱 (cnordformt / com.yonyou.yh.nhis.ex.mtappyaccept.vo.MtapplyacceptVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1596.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mta | 主键 | pk_mta | char(20) | √ | 主键 (UFID) |
| 2 | pk_ordsrv | 医嘱服务主键 | pk_ordsrv | varchar(50) |  | 字符串 (String) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 5 | pk_pati | 患者 | pk_pati | varchar(20) |  | 患者基本信息 (pati) |
| 6 | pk_pvtype | 就诊类型 | pk_pvtype | varchar(20) |  | 就诊类型 (pvtype) |
| 7 | code_pvtype | 就诊类型编码 | code_pvtype | varchar(50) |  | 字符串 (String) |
| 8 | pk_pv | 就诊编码 | pk_pv | varchar(20) |  | 患者就诊 (PatiVisitVO) |
| 9 | pk_ord | 医嘱 | pk_ord | varchar(20) |  | 临床_医嘱 (cnorder) |
| 10 | pk_pres | 处方 | pk_pres | varchar(50) |  | 字符串 (String) |
| 11 | code_pres | 处方编码 | code_pres | varchar(256) |  | 字符串 (String) |
| 12 | pk_srvtype | 服务类型 | pk_srvtype | varchar(50) |  | 字符串 (String) |
| 13 | dt_srvtype | 服务类型编码 | dt_srvtype | varchar(50) |  | 字符串 (String) |
| 14 | flag_srvset | 服务套标志 | flag_srvset | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | pk_srv | 服务 | pk_srv | varchar(50) |  | 字符串 (String) |
| 16 | code_srv | 服务编码 | code_srv | varchar(50) |  | 字符串 (String) |
| 17 | price | 参考价格 | price | decimal(14, 2) |  | 数值 (UFDouble) |
| 18 | pk_freq | 服务频次 | pk_freq | varchar(20) |  | 医嘱频次 (OrdFreqVO) |
| 19 | quan | 医疗单位数量_开立 | quan | decimal(14, 2) |  | 数值 (UFDouble) |
| 20 | pk_measdoc_med | 医疗单位 | pk_measdoc_med | varchar(20) |  | 计量单位 (measdoc) |
| 21 | pk_dept_ordsrv | 开立科室 | pk_dept_ordsrv | varchar(20) |  | 组织_部门 (dept) |
| 22 | pk_wg_phy | 医生医疗组 | pk_wg_phy | varchar(20) |  | 医疗组 (uhworkgrp) |
| 23 | pk_psn_ordsrv | 开立医生 | pk_psn_ordsrv | varchar(20) |  | 人员基本信息 (psndoc) |
| 24 | name_psn_ordsrv | 开立医生名称 | name_psn_ordsrv | varchar(50) |  | 字符串 (String) |
| 25 | eu_status_bill | 记费状态 | eu_status_bill | int |  | 医嘱服务记费状态 (OrdSrvBillStatusEnum) |  | 0=未记费; |
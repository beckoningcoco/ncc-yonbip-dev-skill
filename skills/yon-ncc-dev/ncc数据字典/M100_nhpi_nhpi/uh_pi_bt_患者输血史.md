# |<<

**患者输血史 (uh_pi_bt / com.yonyou.yh.nhis.pi.ov.vo.PiOvBtVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6176.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_patibt | 患者输血史主键 | pk_patibt | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_pati | 患者 | pk_pati | varchar(20) |  | 患者基本信息ov (piovpativo) |
| 5 | pk_mctype | 医疗术语类型 | pk_mctype | varchar(20) |  | 医疗术语类型(自定义档案) (Defdoc-060003) |
| 6 | dt_mctype | 医疗术语类型编码 | dt_mctype | varchar(50) |  | 字符串 (String) |
| 7 | mcsrc | 信息来源 | mcsrc | int |  | 整数 (Integer) |
| 8 | val_bt | 输血量 | val_bt | decimal(14, 2) |  | 数值 (UFDouble) |
| 9 | unit_bt | 输血单位 | unit_bt | varchar(50) |  | 字符串 (String) |
| 10 | pk_mc_bt_pv | 输血_就诊流程 | pk_mc_bt_pv | varchar(20) |  | 基础医疗术语 (MCTermVO) |
| 11 | pk_mc_bt_ehr | 输血_健康档案 | pk_mc_bt_ehr | varchar(20) |  | 基础医疗术语 (MCTermVO) |
| 12 | pk_mc_bt_rhip | 输血_区域平台 | pk_mc_bt_rhip | varchar(20) |  | 基础医疗术语 (MCTermVO) |
| 13 | resion | 原因 | resion | varchar(256) |  | 字符串 (String) |
| 14 | date_bt | 输血日期 | date_bt | char(19) |  | 日期时间 (UFDateTime) |
| 15 | date_entry | 登记日期 | date_entry | char(19) |  | 日期时间 (UFDateTime) |
| 16 | pk_psn | 登记人员 | pk_psn | varchar(20) |  | 人员基本信息 (psndoc) |
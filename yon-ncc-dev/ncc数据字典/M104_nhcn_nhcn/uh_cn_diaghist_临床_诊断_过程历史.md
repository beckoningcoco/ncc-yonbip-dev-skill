# |<<

**临床_诊断_过程历史 (uh_cn_diaghist / com.yonyou.yh.nhis.cn.diag.vo.CNDiagHistoryVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5993.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cndiaghist | 临床诊断主键 | pk_cndiaghist | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_pati | 患者编码 | pk_pati | varchar(20) |  | 患者基本信息 (pati) |
| 5 | pk_pvtype | 就诊类型 | pk_pvtype | varchar(20) |  | 就诊类型 (pvtype) |
| 6 | pk_pv | 就诊编码 | pk_pv | varchar(20) |  | 患者就诊 (PatiVisitVO) |
| 7 | date_diag | 诊断日期 | date_diag | char(19) |  | 日期时间 (UFDateTime) |
| 8 | pk_diagtype | 诊断类型 | pk_diagtype | varchar(20) |  | 诊断类型(自定义档案) (Defdoc-060005) |
| 9 | dt_diagtype | 诊断类型编码 | dt_diagtype | varchar(50) |  | 字符串 (String) |
| 10 | pk_diagsys | 诊诊断编码体系 | pk_diagsys | varchar(20) |  | 编码体系(自定义档案) (Defdoc-060000) |
| 11 | dt_diagsys | 诊断编码体系编码 | dt_diagsys | varchar(50) |  | 字符串 (String) |
| 12 | code | 诊断编码 | code | varchar(50) |  | 字符串 (String) |
| 13 | name | 诊断名称 | name | varchar(50) |  | 字符串 (String) |
| 14 | pk_psn_phy | 诊断医生 | pk_psn_phy | varchar(20) |  | 人员基本信息 (psndoc) |
| 15 | flag_maj | 主要诊断标志 | flag_maj | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | flag_final | 确诊诊断标志 | flag_final | char(1) |  | 布尔类型 (UFBoolean) |
| 17 | flag_susp | 疑似诊断标志 | flag_susp | char(1) |  | 布尔类型 (UFBoolean) |
| 18 | pk_cnet | 临床事件 | pk_cnet | varchar(20) |  | 临床_事件 (cnevent) |
| 19 | note | 备注 | note | varchar(256) |  | 字符串 (String) |
| 20 | pk_org_v | 所属机构版本信息 | pk_org_v | varchar(20) |  | 组织_业务单元_医卫版本 (hisorg_v) |
| 21 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
| 22 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 23 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 24 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
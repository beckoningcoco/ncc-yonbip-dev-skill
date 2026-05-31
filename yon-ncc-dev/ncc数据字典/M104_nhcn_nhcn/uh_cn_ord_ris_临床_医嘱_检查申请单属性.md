# |<<

**临床_医嘱_检查申请单属性 (uh_cn_ord_ris / com.yonyou.yh.nhis.cn.ord.v2.vo.CNOrdRisAppVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6031.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordris | 医嘱检查申请单属性主键 | pk_ordris | char(20) | √ | 主键 (UFID) |
| 2 | pk_ord | 医嘱 | pk_ord | varchar(20) |  | 临床_医嘱 (cnorder) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 5 | note_dise | 病情描述 | note_dise | varchar(4000) |  | 字符串 (String) |
| 6 | pk_diag | 当前主要诊断 | pk_diag | varchar(20) |  | 患者临床综合诊断门诊 (OpPvDiagVO) |
| 7 | desc_diag | 当前诊断描述 | desc_diag | varchar(256) |  | 字符串 (String) |
| 8 | pk_ristype | 检查类型 | pk_ristype | varchar(20) |  | 检查类型(自定义档案) (Defdoc-030100) |
| 9 | dt_ristype | 检查类型编码 | dt_ristype | varchar(50) |  | 字符串 (String) |
| 10 | body_ris | 检查部位描述 | body_ris | varchar(256) |  | 字符串 (String) |
| 11 | orgs_ris | 检查组织描述 | orgs_ris | varchar(50) |  | 字符串 (String) |
| 12 | exampurp | 检查目的与要求 | exampurp | varchar(4000) |  | 字符串 (String) |
| 13 | date_lis_app | 计划检查日期 | date_lis_app | char(19) |  | 日期时间 (UFDateTime) |
| 14 | pk_msp | 医技资源 | pk_msp | varchar(20) |  | 医技资源设备 (MedSrvPVO) |
| 15 | date_confirm | 预约后确定日期 | date_confirm | char(19) |  | 日期时间 (UFDateTime) |
| 16 | ticketno | 排队号 | ticketno | int |  | 整数 (Integer) |
| 17 | time_begin | 预计检查时间 | time_begin | char(8) |  | 时间 (UFTime) |
| 18 | eu_status | 检查过程状态 | eu_status | int |  | 检查过程状态 (OrdRisStatusEnum) |  | 0=申请; |
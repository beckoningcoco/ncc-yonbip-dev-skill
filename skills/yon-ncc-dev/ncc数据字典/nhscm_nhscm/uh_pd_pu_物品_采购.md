# |<<

**物品_采购 (uh_pd_pu / com.yonyou.yh.nhis.scm.uhpd.vo.UhPdPuVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6148.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pdpu | 物品采购订单主键 | pk_pdpu | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构_采购 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | dt_pdputype | 采购类型 | dt_pdputype | varchar(20) |  | 主键 (UFID) |
| 5 | pk_dept_pu | 采购部门 | pk_dept_pu | varchar(20) |  | 组织_部门 (dept) |
| 6 | code | 采购编码 | code | varchar(50) |  | 字符串 (String) |
| 7 | name | 采购名称 | name | varchar(50) |  | 字符串 (String) |
| 8 | pk_sup | 供应商 | pk_sup | varchar(20) |  | 供应商基本信息 (supplier) |
| 9 | date_pu | 订单日期 | date_pu | char(19) |  | 日期 (UFDate) |
| 10 | eu_status | 订单状态 | eu_status | int |  | 整数 (Integer) |
| 11 | pk_psn_pu | 订单经办人 | pk_psn_pu | varchar(20) |  | 人员基本信息 (psndoc) |
| 12 | flag_canc | 取消标志 | flag_canc | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | pk_psn_canc | 取消人员 | pk_psn_canc | varchar(20) |  | 人员基本信息 (psndoc) |
| 14 | date_canc | 取消日期 | date_canc | char(19) |  | 日期 (UFDate) |
| 15 | note | 备注 | note | varchar(50) |  | 字符串 (String) |
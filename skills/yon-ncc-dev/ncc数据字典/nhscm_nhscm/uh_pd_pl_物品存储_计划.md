# |<<

**物品存储_计划 (uh_pd_pl / com.yonyou.yh.nhis.scm.uhpd.vo.UhPdPlVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6146.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pdpl | 物品计划主键 | pk_pdpl | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构_计划 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_dept | 计划部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 5 | pk_stordoc | 计划仓库 | pk_stordoc | varchar(20) |  | 物料仓库信息 (materialwarh) |
| 6 | dt_plantype | 计划类型 | dt_plantype | varchar(50) |  | 字符串 (String) |
| 7 | dt_pdtype | 计划类型new | dt_pdtype | varchar(50) |  | 字符串 (String) |
| 8 | code_pl | 计划编码 | code_pl | varchar(50) |  | 字符串 (String) |
| 9 | name_pl | 计划名称 | name_pl | varchar(50) |  | 字符串 (String) |
| 10 | date_pl | 计划日期 | date_pl | char(19) |  | 日期时间 (UFDateTime) |
| 11 | pk_psn_pl | 制单人 | pk_psn_pl | varchar(20) |  | 人员基本信息 (psndoc) |
| 12 | eu_status | 计划状态 | eu_status | int |  | 整数 (Integer) |
| 13 | flag_acpt | 已接受标志 | flag_acpt | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | flag_active | 有效标志 | flag_active | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | note | 备注 | note | varchar(50) |  | 字符串 (String) |
| 16 | pk_plantype | 计划类型主键 | pk_plantype | varchar(50) |  | 字符串 (String) |
| 17 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 18 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 19 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 20 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
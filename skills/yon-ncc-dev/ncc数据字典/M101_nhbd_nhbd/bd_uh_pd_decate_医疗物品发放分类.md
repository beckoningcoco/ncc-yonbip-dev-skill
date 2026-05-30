# |<<

**医疗物品发放分类 (bd_uh_pd_decate / com.yonyou.yh.nhis.bd.uhpddecate.vo.UHPdDecateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1069.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pddecate | 医疗物品发放分类主键 | pk_pddecate | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_dept_pd | 物品部门 | pk_dept_pd | varchar(20) |  | 组织_部门 (dept) |
| 5 | code_demd | 发放分类编码 | code_demd | varchar(30) |  | 字符串 (String) |
| 6 | name_demd | 发放分类名称 | name_demd | varchar(50) |  | 字符串 (String) |
| 7 | wheresql | 筛选条件串 | wheresql | varchar(4000) |  | 备注 (Memo) |
| 8 | flag_active | 启用标志 | flag_active | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | note | 描述 | note | varchar(256) |  | 备注 (Memo) |
| 10 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 11 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 12 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 13 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 14 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
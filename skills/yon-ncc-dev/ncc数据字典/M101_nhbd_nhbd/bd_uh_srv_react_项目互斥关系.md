# |<<

**项目互斥关系 (bd_uh_srv_react / com.yonyou.yh.nhis.bd.srvexclusive.vo.SrvExclusiveVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1122.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_srvreact | 主键 | pk_srvreact | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | code | 排斥编码 | code | varchar(50) |  | 字符串 (String) |
| 5 | name | 排斥名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | pk_reacttype | 排斥类型组件 | pk_reacttype | varchar(20) |  | 排斥类型(自定义档案) (Defdoc-050000) |
| 7 | dt_reacttype | 排斥类型编码 | dt_reacttype | varchar(50) |  | 字符串 (String) |
| 8 | pk_org_v | 机构多版本 | pk_org_v | varchar(20) |  | 组织_业务单元_医卫版本 (hisorg_v) |
| 9 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 10 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 12 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
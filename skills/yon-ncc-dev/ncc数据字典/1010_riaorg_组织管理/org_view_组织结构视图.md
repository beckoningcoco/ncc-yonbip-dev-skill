# |<<

**组织结构视图 (org_view / nc.vo.org.orgview.OrgViewVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4185.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_orgview | 主键 | pk_orgview | char(20) | √ | 主键 (UFID) |
| 2 | history_v | 历史版本号 | history_v | varchar(100) | √ | 字符串 (String) |
| 3 | viewscope | 视图范围 | viewscope | int |  | 组织机构视图范围 (orgviewscopeenum) |  | 0=全局范围; |
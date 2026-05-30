# |<<

**月结检查项 (org_checkitem / nc.vo.org.closeaccbook.CheckItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4024.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_checkitem | 月结检查项主键 | pk_checkitem | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | moduleid | 所属模块 | moduleid | varchar(20) |  | 模块信息 (module) |
| 5 | code | 检查项编码 | code | varchar(50) |  | 字符串 (String) |
| 6 | name | 检查项名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | pk_checktype | 检查项类别 | pk_checktype | varchar(20) |  | 月结检查项类别 (checktype) |
| 8 | associpoint | 关联节点 | associpoint | varchar(20) |  | 功能实体 (functionEntity) |
| 9 | checkattr | 检查项属性 | checkattr | int |  | 检查项属性 (checkitemattribute) | 1 | 0=系统; |
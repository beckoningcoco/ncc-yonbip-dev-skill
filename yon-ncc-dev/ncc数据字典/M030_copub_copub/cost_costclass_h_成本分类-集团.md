# |<<

**成本分类-集团 (cost_costclass_h / nc.vo.hrpco.costingclassgp.CostingclassVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1607.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_costclass | 主键 | pk_costclass | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | code | 成本分类编号 | code | varchar(50) |  | 字符串 (String) |
| 6 | name | 成本分类名称 | name | varchar(50) |  | 字符串 (String) |
| 7 | parentid | 上级分类 | parentid | varchar(20) |  | 主键 (UFID) |
| 8 | parentname | 上级分类名称 | parentname | varchar(20) |  | 成本分类-集团 (CostingclassgpVO) |
| 9 | capitalres | 资金来源 | capitalres | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | enablestate | 启用状态 | enablestate | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | vmemo | 备注 | vmemo | varchar(50) |  | 字符串 (String) |
| 12 | maketime | 制单时间 | maketime | char(19) |  | 日期时间 (UFDateTime) |
| 13 | lastmaketime | 最后修改时间 | lastmaketime | char(19) |  | 日期时间 (UFDateTime) |
| 14 | grade | 级次 | grade | int |  | 整数 (Integer) |
| 15 | inforesourse | 信息来源 | inforesourse | varchar(50) |  | 字符串 (String) |
| 16 | drugtype | 药品类型 | drugtype | int |  | 药品类型 (DrugType) |  | 1=西药费; |
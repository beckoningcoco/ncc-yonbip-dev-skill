# |<<

**公共险种项目 (bm_item / nc.vo.bm.item.BmItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1228.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bm_item | 险种项目主键 | pk_bm_item | varchar(50) | √ | 字符串 (String) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | code | 编码 | code | varchar(50) | √ | 字符串 (String) |
| 5 | name | 名称 | name | varchar(50) | √ | 多语文本 (MultiLangText) |
| 6 | category_id | 项目分类 | category_id | varchar(20) | √ | 社保项目分类(自定义档案) (Defdoc-HRBM002_0xx) |
| 7 | itemkey | 险种项目对应字段 | itemkey | varchar(50) |  | 字符串 (String) |
| 8 | iitemtype | 数据类型 | iitemtype | int | √ | 数据类型 (TypeEnumVO) |  | 0=数值型; |
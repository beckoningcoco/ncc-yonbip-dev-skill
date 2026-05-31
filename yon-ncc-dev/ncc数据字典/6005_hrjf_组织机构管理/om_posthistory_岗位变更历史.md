# |<<

**岗位变更历史 (om_posthistory / nc.vo.om.post.PostHistoryVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3966.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_post_sub | 变更主键 | pk_post_sub | char(20) | √ | 主键 (UFID) |
| 2 | pk_post | 岗位主键 | pk_post | varchar(20) |  | 岗位基本信息 (om_post) |
| 3 | postname | 岗位名称 | postname | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | postcode | 岗位编码 | postcode | varchar(50) |  | 字符串 (String) |
| 5 | opertype | 变更类别 | opertype | varchar(50) |  | 岗位变更类型枚举 (OperType) |  | 1=设立; |
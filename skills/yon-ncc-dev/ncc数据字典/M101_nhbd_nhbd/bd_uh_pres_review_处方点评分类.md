# |<<

**处方点评分类 (bd_uh_pres_review / com.yonyou.yh.nhis.bd.pdpresreview.vo.PdPresReviewVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1089.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_presreview | 处方点评分类主键 | pk_presreview | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | code_presview | 分类编码 | code_presview | varchar(50) |  | 字符串 (String) |
| 5 | name_presview | 分类名称 | name_presview | varchar(50) |  | 字符串 (String) |
| 6 | note | 描述 | note | varchar(50) |  | 字符串 (String) |
| 7 | flag_active | 启用标志 | flag_active | char(1) |  | 布尔类型 (UFBoolean) |
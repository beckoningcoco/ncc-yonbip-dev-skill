# |<<

**处方点评分类明细 (bd_uh_pres_review_dt / com.yonyou.yh.nhis.bd.pdpresreview.vo.PdPresReviewDtVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1090.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_presreviewdt | 处方点评分类明细主键 | pk_presreviewdt | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | code_presreviewdt | 分类明细编码 | code_presreviewdt | varchar(50) |  | 字符串 (String) |
| 5 | name_presreviewdt | 分类明细名称 | name_presreviewdt | varchar(50) |  | 字符串 (String) |
| 6 | condition_judge | 判断条件 | condition_judge | varchar(50) |  | 字符串 (String) |
| 7 | item_value | 扣分值 | item_value | decimal(14, 2) |  | 数值 (UFDouble) |
| 8 | flag_active | 启用标志 | flag_active | char(1) |  | 布尔类型 (UFBoolean) |
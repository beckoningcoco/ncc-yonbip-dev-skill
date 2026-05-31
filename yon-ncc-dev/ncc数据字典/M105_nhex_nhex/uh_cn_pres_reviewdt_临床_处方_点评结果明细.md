# |<<

**临床_处方_点评结果明细 (uh_cn_pres_reviewdt / com.yonyou.yh.nhis.bd.cnpresreview.vo.CnPresReviewDtVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6051.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cnpresviewdt | 处方点评明细主键 | pk_cnpresviewdt | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_preview | 点评结果 | pk_preview | varchar(20) |  | 处方点评分类明细 (PdPresReviewDtVO) |
| 5 | name_preview | 点评结果内容 | name_preview | varchar(50) |  | 字符串 (String) |
| 6 | desc_review | 点评结果描述 | desc_review | varchar(50) |  | 字符串 (String) |
# |<<

**质控项目可替代项 (bd_emr_qa_item_repl / com.yonyou.yh.nhis.bd.qa.vo.EmrQaItemReplVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/822.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_emrqaitemrepl | 质控项目可替代项主键 | pk_emrqaitemrepl | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(50) |  | 字符串 (String) |
| 3 | pk_org | 所属组织 | pk_org | char(20) |  | 主键 (UFID) |
| 4 | pk_bdemrqaitem | 质控项目 | pk_bdemrqaitem | varchar(20) |  | 质控项目 (EmrQaItemVO) |
| 5 | pk_bdemrqaitem_rep | 可替代质控项目 | pk_bdemrqaitem_rep | varchar(20) |  | 质控项目 (EmrQaItemVO) |
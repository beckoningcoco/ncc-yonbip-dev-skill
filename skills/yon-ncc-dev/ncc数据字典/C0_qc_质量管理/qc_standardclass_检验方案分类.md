# |<<

**检验方案分类 (qc_standardclass / nc.vo.qc.standardclass.entity.StandardClassVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4869.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_standardclass | 检验方案分类主键 | pk_standardclass | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 质检中心 | pk_org | varchar(20) |  | 组织_业务单元_质检中心 (qccenter) |
| 4 | vclasscode | 检验方案分类编码 | vclasscode | varchar(50) |  | 字符串 (String) |
| 5 | vclassname | 检验方案分类名称 | vclassname | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | vmemo | 备注 | vmemo | varchar(181) |  | 字符串 (String) |
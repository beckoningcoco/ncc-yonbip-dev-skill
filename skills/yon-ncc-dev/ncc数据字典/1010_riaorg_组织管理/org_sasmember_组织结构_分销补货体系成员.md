# |<<

**组织结构_分销补货体系成员 (org_sasmember / nc.vo.corg.SaleAppendStruMemberVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4166.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sasmember | 分销补货体系成员主键 | pk_sasmember | char(20) | √ | 主键 (UFID) |
| 2 | pk_fatherorg | 上级组织 | pk_fatherorg | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 3 | pk_sas | 分销补货体系主键 | pk_sas | char(20) | √ | 组织结构_分销补货体系 (saleappendstru) |
| 4 | pk_org | 对应组织 | pk_org | char(20) | √ | 组织_业务单元_库存组织 (stockorg) |
| 5 | innercode | 内部编码 | innercode | varchar(200) |  | 字符串 (String) |
| 6 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) | 0 | 0=本级产生; |
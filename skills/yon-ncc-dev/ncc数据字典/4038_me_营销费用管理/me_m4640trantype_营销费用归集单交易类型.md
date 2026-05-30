# |<<

**营销费用归集单交易类型 (me_m4640trantype / nc.vo.me.m4640trantype.entity.M4640TranTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3613.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_trantype | 归集单交易类型pk | pk_trantype | char(20) | √ | 主键 (UFID) |
| 2 | ctrantypeid | 交易类型 | ctrantypeid | varchar(20) |  | 字符串 (String) |
| 3 | vtrantypecode | 交易类型编码 | vtrantypecode | varchar(40) |  | 字符串 (String) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | bcostcenterflag | 成本中心 | bcostcenterflag | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | bprojectflag | 项目 | bprojectflag | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | bcustomerflag | 客户 | bcustomerflag | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | bprodlineflag | 产品线 | bprodlineflag | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | bbrandflag | 品牌 | bbrandflag | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | bmaterialflag | 物料 | bmaterialflag | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | bmanulflag | 自制 | bmanulflag | char(1) |  | 布尔类型 (UFBoolean) |